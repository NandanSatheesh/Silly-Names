package nandansatheesh.github.io.startupnamegenerator.controller;

import nandansatheesh.github.io.startupnamegenerator.service.NamesService;
import nandansatheesh.github.io.startupnamegenerator.utils.Permute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NamesController {

    @Autowired
    private NamesService namesService;

    @RequestMapping(value = "/api/{name}", method = RequestMethod.GET)
    public List<String> generateStartUpNames(@PathVariable String name) {
        return namesService.generateAllNames(Arrays.asList(name.split(" ")));
    }
}
