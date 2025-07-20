package io.github.lukasds.api_gateway.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class todoController {
    @GetMapping("/todos")
    public String getTodos() {
        // This is a placeholder for the actual implementation.
        List<String> todos = List.of("Todo 1", "Todo 2", "Todo 3");

        // Convert the list to JSON format
        StringBuilder jsonBuilder = new StringBuilder("[\n");
        for (int i = 0; i < todos.size(); i++) {
            jsonBuilder.append("  \"").append(todos.get(i)).append("\"");
            if (i < todos.size() - 1) {
                jsonBuilder.append(",\n");
            }
        }
        jsonBuilder.append("\n]");
        return jsonBuilder.toString();
    }
}
