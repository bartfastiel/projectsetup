package de.neuefische.projectsetup.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    @GetMapping
    String cat() {
        return "Meau";
    }
}
