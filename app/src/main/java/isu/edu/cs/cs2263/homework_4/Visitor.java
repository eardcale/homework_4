package isu.edu.cs.cs2263.homework_4;

public interface Visitor {
     void visit(Aquaintance a);
     void visit(Friend f);
     void visit(SignificantOther so);
     void visit(Spouse sp);
}
