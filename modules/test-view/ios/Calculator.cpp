//
//  Calculator.cpp
//  react-native-test-view
//
//  Created by Nikita Tikhonov on 13.07.2024.
//

#include "Calculator.h"
#include <stdexcept>

// Конструктор
Calculator::Calculator() {
    // Можно инициализировать что-либо, если нужно
}

// Метод для сложения
int Calculator::add(int a, int b) {
    return a + b;
}

// Метод для вычитания
int Calculator::subtract(int a, int b) {
    return a - b;
}

// Метод для умножения
int Calculator::multiply(int a, int b) {
    return a * b;
}

// Метод для деления
double Calculator::divide(int a, int b) {
    if (b == 0) {
        throw std::invalid_argument("Division by zero is not allowed");
    }
    return static_cast<double>(a) / b;
}

