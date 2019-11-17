package nandansatheesh.github.io.startupnamegenerator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ScoreAndName implements Comparable<ScoreAndName> {

    private String name;
    private double score;

    @Override
    public int compareTo(ScoreAndName o) {
        return Double.compare(o.score, this.score);
    }
}
