package com.springRESTApi.springRestApi.todoRestApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int idCounter = 0;

    static{
        todos.add(new Todo(++idCounter, "Estiack Ahmed", "Intigrate angular frontend", new Date(), false));
        todos.add(new Todo(++idCounter, "Sadia Zaman", "Taking lunch on time", new Date(), false));
        todos.add(new Todo(++idCounter, "Estiack Ahmed", "Take some powernap", new Date(), false));
    }
    
    public List<Todo> getAllTodos() {
        return todos;
    }
}
