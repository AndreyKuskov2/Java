package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }

    @GetMapping("/user/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new Users());
        return "add-user";
    }

    @PostMapping("/user/add")
    public String addUserSubmit(@ModelAttribute Users user) {
        userRepository.save(user);
        return "redirect:/";
    }

    @GetMapping("/user/edit/{id}")
    public String editUserForm(@PathVariable("id") long id, Model model) {
        Users user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id: " + id));

        model.addAttribute("user", user);
        return "edit-user";
    }

    @PostMapping("/user/edit/{id}")
    public String editUserSubmit(@PathVariable("id") long id, @ModelAttribute Users user) {
        userRepository.save(user);
        return "redirect:/";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        Users user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id: " + id));

        userRepository.delete(user);
        return "redirect:/";
    }
}
