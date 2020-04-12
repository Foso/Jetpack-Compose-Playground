/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.shape.GenericShape
import androidx.ui.foundation.shape.RectangleShape
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.CutCornerShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.*
import androidx.ui.layout.*
import androidx.ui.unit.Density
import androidx.ui.unit.PxSize
import androidx.ui.unit.dp


@Composable
fun CircleShapeDemo(){
    BoxDemo(shape = CircleShape)
}

@Composable
fun BoxDemo(shape: Shape){
    Column(modifier = Modifier.fillMaxWidth() + Modifier.wrapContentSize(Alignment.Center)) {
        Box(
            modifier = Modifier.preferredSize(100.dp),
            backgroundColor = Color.Red,
            shape = shape
        ) {

                    }
    }
}

@Composable
fun RoundedCornerShapeDemo(){
    BoxDemo(shape = RoundedCornerShape(10.dp))
}

@Composable
fun CutCornerShapeDemo(){
    BoxDemo(shape = CutCornerShape(10.dp))
}



@Composable
fun RectangleShapeDemo(){
    BoxDemo(shape = RectangleShape)
}

@Composable
fun TriangleShapeDemo(){
    BoxDemo(shape = CustomShape())
}


/**
 * You can draw custom shapes.
 * Use a GenericShape.
 */



private val TriangleShape = GenericShape { size ->
    /**
     *
    Inside the GenericShape you can draw your custom shape.
    You have access to the **size**-object. This is size of the composable that the shape is applied to.
    You can get the height with **size.height.value** and the width with **size.width.value**


    1) Initially the painter will start at the top left of the parent composable(0x,0y).
    With **moveTo()** you can set the coordinates of the painter. Here the coordinates will be set to the half width of the parent layout
    and a 0y coordinate.

    2) This will draw a line from the painter coordinates, which were set in **1)**, to the bottom right corner of the parent layout.
    The painter coordinates are then automatically set to this corner.

    3) This will draw a line to the bottom left corner. GenericShape will implicit execute the **close()**-function. **close()** will draw a line from the last painter coordinates to the first definied.
     */

   /**
    * 1)
    */
    moveTo(size.width.value / 2f, 0f)
    //This will draw a line from the cursor to the x/y coordinates

    /**
     * 2)
     */
    lineTo(size.width.value, size.height.value)

    /**
     * 3)
     */
    lineTo(0f, size.height.value)
}


class CustomShape : Shape {
    override fun createOutline(size: PxSize, density: Density): Outline {
        val path = Path().apply {
            moveTo(size.width.value / 2f, 0f)
            lineTo(size.width.value, size.height.value)
            lineTo(0f, size.height.value)
            close()
        }
        return Outline.Generic(path)
    }
}