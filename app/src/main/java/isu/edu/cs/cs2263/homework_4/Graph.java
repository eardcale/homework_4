package isu.edu.cs.cs2263.homework_4;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.NetworkBuilder;

public class Graph {
    private MutableNetwork<Person, Relationship > network = NetworkBuilder.directed().build();
    public Graph(MutableNetwork<Person, Relationship> n){
        network = n;

    }
    public void addPerson(String f,String l,int a){
        network.addNode(new Person(f,l,a));
    }
}
