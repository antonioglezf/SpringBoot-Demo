package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeveloperController {

    @Autowired
    private Developer developerService;

    @Autowired
    private Skill skillService;

    @GetMapping("/developers")
    public String getAllDevelopers(Model model) {
        model.addAttribute("developers", developerService.getAllDevelopers());
        return "developer-list"; 
    }

    @GetMapping("/developer/{id}")
    public String getDeveloperSkills(@PathVariable Long id, Model model) {
        Developer developer = developerService.getDeveloperById(id);
        model.addAttribute("developer", developer);
        return "developer-skills"; // Este es el nombre de la vista que mostrará las habilidades del desarrollador.
    }

    @PostMapping("/developer")
    public String createDeveloper(@RequestParam String firstName, @RequestParam String lastName,
            @RequestParam String email, @RequestParam Long skillId) {
        Skill skill = skillService.getSkillById(skillId);
        Developer newDeveloper = new Developer(firstName, lastName, email, Arrays.asList(skill));
        developerService.saveDeveloper(newDeveloper);
        return "redirect:/developers"; // Redirige a la lista de desarrolladores después de crear uno nuevo.
    }
}
