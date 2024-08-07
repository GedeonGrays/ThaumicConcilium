package com.sasmaster.glelwjgl.java;

public interface GLE
{
    String VERSION = "$Id: GLE.java,v 1.3 1998/05/02 12:06:39 descarte Exp descarte $";
    int SUMMARY = 0;
    int VERBOSE = 1;
    int TUBE_JN_RAW = 1;
    int TUBE_JN_ANGLE = 2;
    int TUBE_JN_CUT = 3;
    int TUBE_JN_ROUND = 4;
    int TUBE_JN_MASK = 15;
    int TUBE_JN_CAP = 16;
    int TUBE_NORM_FACET = 256;
    int TUBE_NORM_EDGE = 512;
    int TUBE_NORM_PATH_EDGE = 1024;
    int TUBE_NORM_MASK = 3840;
    int TUBE_CONTOUR_CLOSED = 4096;
    int GLE_TEXTURE_ENABLE = 65536;
    int GLE_TEXTURE_STYLE_MASK = 255;
    int GLE_TEXTURE_VERTEX_FLAT = 1;
    int GLE_TEXTURE_NORMAL_FLAT = 2;
    int GLE_TEXTURE_VERTEX_CYL = 3;
    int GLE_TEXTURE_NORMAL_CYL = 4;
    int GLE_TEXTURE_VERTEX_SPH = 5;
    int GLE_TEXTURE_NORMAL_SPH = 6;
    int GLE_TEXTURE_VERTEX_MODEL_FLAT = 7;
    int GLE_TEXTURE_NORMAL_MODEL_FLAT = 8;
    int GLE_TEXTURE_VERTEX_MODEL_CYL = 9;
    int GLE_TEXTURE_NORMAL_MODEL_CYL = 10;
    int GLE_TEXTURE_VERTEX_MODEL_SPH = 11;
    int GLE_TEXTURE_NORMAL_MODEL_SPH = 12;
    
    int gleGetJoinStyle();
    
    void gleSetJoinStyle(final int p0);
    
    void gleTextureMode(final int p0);
    
    void glePolyCylinder(final int p0, final double[][] p1, final float[][] p2, final double p3, final float p4, final float p5) throws GLEException;
    
    void glePolyCone(final int p0, final double[][] p1, final float[][] p2, final double[] p3, final float p4, final float p5) throws GLEException;
    
    void gleExtrusion(final int p0, final double[][] p1, final double[][] p2, final double[] p3, final int p4, final double[][] p5, final float[][] p6) throws GLEException;
    
    void gleTwistExtrusion(final int p0, final double[][] p1, final double[][] p2, final double[] p3, final int p4, final double[][] p5, final float[][] p6, final double[] p7) throws GLEException;
    
    void gleSuperExtrusion(final int p0, final double[][] p1, final double[][] p2, final double[] p3, final int p4, final double[][] p5, final float[][] p6, final double[][][] p7) throws GLEException;
    
    void gleSpiral(final int p0, final double[][] p1, final double[][] p2, final double[] p3, final double p4, final double p5, final double p6, final double p7, final double[][] p8, final double[][] p9, final double p10, final double p11) throws GLEException;
    
    void gleLathe(final int p0, final double[][] p1, final double[][] p2, final double[] p3, final double p4, final double p5, final double p6, final double p7, final double[][] p8, final double[][] p9, final double p10, final double p11) throws GLEException;
    
    void gleHelicoid(final double p0, final double p1, final double p2, final double p3, final double p4, final double[][] p5, final double[][] p6, final double p7, final double p8) throws GLEException;
    
    void gleToroid(final double p0, final double p1, final double p2, final double p3, final double p4, final double[][] p5, final double[][] p6, final double p7, final double p8) throws GLEException;
    
    void gleScrew(final int p0, final double[][] p1, final double[][] p2, final double[] p3, final double p4, final double p5, final double p6) throws GLEException;
}
