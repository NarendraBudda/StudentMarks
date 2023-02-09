package com.marks;

public class StudentMarks {
    public int calculateMarks(int math,int physics,int chemistry,int biology){
        return math+physics+chemistry+biology;
    }
    public int calculateMarks(int physics,int maths,int chemistry){
        return physics+maths+chemistry;
    }
    public float calculateMarks(int businessStudies,int finance,float accounting) {

        return businessStudies + finance + accounting;
    }
}
