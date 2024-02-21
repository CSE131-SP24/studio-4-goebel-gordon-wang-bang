package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		
			int redComponent= 109;
			int greenComponent= 182;
			int blueComponent= 255;
			double x=.5;
			double y=.5;
			double halfWidth= .5;
			double halfheight=.3;
			Color color = new Color(redComponent, greenComponent, blueComponent);
			StdDraw.setPenColor(color);
			StdDraw.filledRectangle(x,y, halfWidth, halfheight);
			Color orange = new Color(235, 152, 52);
			StdDraw.setPenColor(orange);
			StdDraw.filledEllipse(.52,.5, .2, .1); 
			double[]z= {.25,.4,.25};
			double[]j= {.6,.5,.4};
			StdDraw.filledEllipse(.5,.5, .2, .1); 
			StdDraw.filledPolygon(z,j); 
			double[]c= {.45,.6,.45};
			double[]g={.65,.5,.35};
			StdDraw.filledPolygon(c,g); 

			Color black = new Color(18, 17, 17);
			StdDraw.setPenColor(black);
			StdDraw.filledEllipse(0.59984375,0.546171875, .013, .013);
			StdDraw.arc(.53, .47, .04, 300, 70);
			StdDraw.arc(.5, .47, .04, 300, 70);
			StdDraw.arc(.56, .47, .04, 300, 70);
			StdDraw.arc(.7, .5, .04, 210, 270);

			Color white = new Color(255,255,255);
			StdDraw.setPenColor(white);
			StdDraw.filledCircle(.7, .6, .01);
			StdDraw.filledCircle(.72, .65, .01);
			StdDraw.filledCircle(.67, .7, .01);
			StdDraw.filledCircle(.7, .75, .01);
			StdDraw.filledCircle(0.6065,0.543171875, .0054);

	}
}