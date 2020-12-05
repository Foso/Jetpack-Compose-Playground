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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.ui.draw.clip

@Composable
fun CircleShapeDemo(){
    BoxDemo(CircleShape)
}

@Composable
fun BoxDemo(shape: Shape){
    Column(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)) {
        Box(
            modifier = Modifier.preferredSize(100.dp).background(Color.Red).clip(shape)
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
    moveTo(size.width / 2f, 0f)
    //This will draw a line from the cursor to the x/y coordinates

    /**
     * 2)
     */

    /**
     * 2)
     */
    lineTo(size.width, size.height)

    /**
     * 3)
     */

    /**
     * 3)
     */
    lineTo(0f, size.height)
}


class CustomShape : Shape {


    override fun createOutline(size: Size, density: Density): Outline {
        val path = Path().apply {
            moveTo(size.width / 2f, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        return Outline.Generic(path)

    }
}