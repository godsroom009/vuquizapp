package shahzayb.vuquizdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import shahzayb.vuquizdemo.entity.Quiz;
import shahzayb.vuquizdemo.service.QuizService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final QuizService quizService;

    @Autowired
    public AdminController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public String admin() {
        return "admin";
    }

    @GetMapping("/quiz/create")
    public String createQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "createQuiz";
    }

    @PostMapping("/quiz/create")
    public String createQuiz(@ModelAttribute Quiz quiz) {
        quizService.createQuiz(quiz);
        return "redirect:/admin";
    }

    @GetMapping("/quiz/update/{id}")
    public String updateQuizForm(@PathVariable Long id, Model model) {
        Quiz quiz = quizService.getQuizById(id);
        model.addAttribute("quiz", quiz);
        return "updateQuiz";
    }

    @PostMapping("/quiz/update")
    public String updateQuiz(@ModelAttribute Quiz quiz) {
        quizService.updateQuiz(quiz);
        return "redirect:/admin";
    }

    @GetMapping("/quiz/delete/{id}")
    public String deleteQuizForm(@PathVariable Long id, Model model) {
        Quiz quiz = quizService.getQuizById(id);
        model.addAttribute("quiz", quiz);
        return "deleteQuiz";
    }

    @PostMapping("/quiz/delete")
    public String deleteQuiz(@RequestParam Long id) {
        quizService.deleteQuiz(id);
        return "redirect:/admin";
    }
}
