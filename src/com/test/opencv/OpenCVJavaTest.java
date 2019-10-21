package com.test.opencv;

import org.opencv.core.*;

import org.opencv.imgcodecs.Imgcodecs;
import com.ImageViewer.ImageViewer;



public class OpenCVJavaTest{
    static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) throws CvException {
//        System.out.println("Welcome to OpenCV " + Core.VERSION);
//        Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
//        System.out.println("OpenCV Mat: " + m);
//        Mat mr1 = m.row(1);// 取该矩阵的第1行
//        mr1.setTo(new Scalar(1));//将第一行的数值设为1
//        Mat mc5 = m.col(5);
//        mc5.setTo(new Scalar(3));
//        System.out.println("OpenCV Mat data:\n" + m.dump());
//
//        // TODO Auto-generated method stub
//        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
//        Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
//        System.out.println( "mat = \n" + mat.dump() );


        Mat mat = Imgcodecs.imread("C:/Users/Administrator/Desktop/lishan.png");
        ImageViewer imageViewer = new ImageViewer(mat, "第一幅图片");
        imageViewer.imshow();
        System.out.println();
    }
    }
