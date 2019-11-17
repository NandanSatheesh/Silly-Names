package nandansatheesh.github.io.startupnamegenerator.service;

import nandansatheesh.github.io.startupnamegenerator.model.ScoreAndName;
import nandansatheesh.github.io.startupnamegenerator.utils.Normalize;
import nandansatheesh.github.io.startupnamegenerator.utils.Permute;
import nandansatheesh.github.io.startupnamegenerator.utils.Score;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class NamesService {

    public List<String> generateAllNames(List<String> wordsList) {

        List<String> generatedNamesList = Permute.permutateStrings(wordsList);

        List<ScoreAndName> scoreAndNameList = new ArrayList<>();

        generatedNamesList.stream().forEach(name -> {
            ScoreAndName object = new ScoreAndName();
            object.setName(Normalize.getNormalizedString(name));
            object.setScore(Score.calculateOverAllScore(name));
            scoreAndNameList.add(object);
        });

        Collections.sort(scoreAndNameList);

        List<String> finalList = new ArrayList<>();

        scoreAndNameList.stream().forEach(scoreAndName -> {
            finalList.add(scoreAndName.getName());
        });

        return finalList;
    }
}
