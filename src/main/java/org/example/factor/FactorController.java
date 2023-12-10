package org.example.factor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FactorController {

    @GetMapping("/factor/form")
    public String showForm(Model model) {
        // Создание объекта FactorForm для отображения в форме
        FactorForm factorForm = new FactorForm();
        model.addAttribute("factorForm", factorForm);
        return "form"; // Имя HTML-файла без расширения
    }

//    @PostMapping("/factor6/form")
//    public String processForm(@ModelAttribute("factorForm") FactorForm factorForm) {
//        // Обработка данных из формы
//        String inputData = factorForm.getData();
//        // Ваша логика обработки данных здесь
//
//        // Возвращение страницы с результатами или другой обработкой
//        return "result"; // Имя HTML-файла без расширения
//    }
}
