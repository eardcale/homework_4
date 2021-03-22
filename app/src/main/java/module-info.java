module cs2263.main{
    requires javafx.controls;
    requires com.google.common;
    requires com.google.gson;
    exports isu.edu.cs.cs2263.homework_4;
    opens edu.isu.cs.cs2263.javafx to com.google.gson;

}