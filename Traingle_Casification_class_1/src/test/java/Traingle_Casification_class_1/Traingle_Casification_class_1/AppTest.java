package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	//-----------------------------Not_Triangle---------------------------------
	@Test
	public void C1C2C3C4F(){
        int a = 1;
        int b = 2;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	@Test
	public void C1C2C3FC4T(){
        int a = 8;
        int b = 3;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	@Test
	public void C1C2C4FC3T(){
        int a = 1;
        int b = 2;
        int c=1;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	@Test
	public void C1C3C4FC2T(){
        int a = 4;
        int b = 4;
        int c=9;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	//-------------------------------equilateralTriangle----------------------------------
	@Test
	public void C1C2C3C4T(){
        int a = 3;
        int b = 3;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        // error 
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	//---------------------------------check_Scalene----------------------------------
	@Test
	//משולש
	public void C1TC2C3C4F(){
        int a = 2; 
        int b = 3;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        //error
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	//---------------------------------isoscelesTriangle-----------------------------------------
	
	@Test
	//שווה שוקיים
	public void C1C4TC2C3F(){
        int a = 5;
        int b = 3;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	@Test
	//שווה שוקיים
	public void C1C3TC2C4F(){
        int a = 2;
        int b = 3;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	@Test
	//שווה שוקיים
	public void C1C2TC3C4F(){
        int a = 2;
        int b = 2;
        int c=1;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	
	
	
	
	
	
	
}  