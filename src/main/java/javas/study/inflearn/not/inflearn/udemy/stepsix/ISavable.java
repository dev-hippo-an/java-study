package javas.study.inflearn.not.inflearn.udemy.stepsix;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
