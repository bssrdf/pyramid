package edu.neu.ccs.pyramid.regression;

import edu.neu.ccs.pyramid.regression.regression_tree.RegTreeTrainer;
import edu.neu.ccs.pyramid.regression.regression_tree.RegressionTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RegressorTest {
    public static void main(String[] args) {
        List<Regressor> list =new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(RegTreeTrainer.constantTree(i));
        }
        for (Regressor regressor: list){
            if (RegressionTree.class.isInstance(regressor)){
                System.out.println(((RegressionTree)regressor).getNumLeaves());
            }

        }
    }

}