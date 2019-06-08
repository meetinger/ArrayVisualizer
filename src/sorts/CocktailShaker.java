/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import static array.visualizer.ArrayVisualizer.compare;
import static array.visualizer.ArrayVisualizer.marked;
import static array.visualizer.ArrayVisualizer.sleep;
import static array.visualizer.Writes.swap;

/*
MIT License

Copyright (c) 2019 w0rthy

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

public class CocktailShaker {
    public static void cocktailShakerSort(int[] array, int length){
        int i = 0;
        while(i<length/2){
            for(int j = i; j < length-i-1; j++){
                if(compare(array[j], array[j+1]) == 1) {
                    swap(array, j, j+1, 0.1, true);
                }
                marked.set(1, j);
                marked.set(2, j+1);
                sleep(0.01);
            }
            for(int j = length-i-1; j > i; j--){
                if(compare(array[j], array[j-1]) == -1) {
                    swap(array, j, j-1, 0.1, true);
                }
                marked.set(1, j);
                marked.set(2, j-1);
                sleep(0.01);
            }
            i++;
            marked.set(1, -5);
            marked.set(2, -5);
        }
    }
}