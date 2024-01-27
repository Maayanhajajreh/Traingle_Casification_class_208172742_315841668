package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        // error 
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	@Test
	//משולש
	public void check_Scalene(){
        int a = 2; 
        int b = 3;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        //error
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	
	@Test
	//שווה שוקיים
	public void isoscelesTriangle(){
        int a = 5;
        int b = 5;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
	
	@Test
	public void Nottriangle(){
        int a = 2;
        int b = 2;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        System.out.println(result);
        assertEquals(expected, result);
    }
	
	
	
}  