package com.volod96.theClassicals.reboot.composer;

import com.volod96.theClassicals.reboot.util.AssertionUtility;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComposerController {

    private ComposerService composerService;

    public ComposerController(ComposerService composerService) {
        AssertionUtility.assertNullObject(composerService);
        this.composerService = composerService;
    }

    @GetMapping(path = "/composers")
    public List<Composer> getAllComposers() {
        return this.composerService.getAllComposers();
    }

    @GetMapping(path = "/composers/{id}")
    public Composer getComposer(@PathVariable int id) {
        return this.composerService.getComposer(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/composers")
    public void addComposer(@RequestBody Composer composer) {
        this.composerService.addComposer(composer);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/composers")
    public void updateComposer(@RequestBody Composer composer) {
        this.composerService.updateComposer(composer);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/composers/{id}")
    public void deleteComposer(@PathVariable int id) {
        this.composerService.removeComposer(id);
    }
}
