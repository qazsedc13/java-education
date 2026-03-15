# Java Education Project

Этот проект представляет собой сборник обучающих примеров по языку программирования Java. Он структурирован как рабочее пространство Eclipse (Eclipse Workspace) и содержит несколько подпроектов, охватывающих основы языка.

## Структура проекта

Проект разделен на несколько папок в директории `Workspace/`:

### 1. [1JavaTypes](file:///c:/Users/user/Documents/code/java-education/Workspace/1JavaTypes)
Изучение примитивных типов данных в Java.
- **Основные темы**: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`.
- **Особенности**: Демонстрация записи чисел с подчеркиванием, работа с различными системами счисления (двоичная, восьмеричная, шестнадцатеричная) и использование Unicode.
- **Файл**: [JavaTypesClass.java](file:///c:/Users/user/Documents/code/java-education/Workspace/1JavaTypes/src/JavaTypesClass.java)

### 2. [2JavaOperators](file:///c:/Users/user/Documents/code/java-education/Workspace/2JavaOperators)
Изучение операторов Java.
- **Арифметические операторы**: `+`, `-`, `*`, `/`, `%`, инкремент (`++`) и декремент (`--`), сокращенные формы присваивания (`+=`, `-=`, и т.д.).
- **Битовые операторы**: Поразрядное отрицание (`~`), И (`&`), ИЛИ (`|`), исключающее ИЛИ (`^`), сдвиги (`<<`, `>>`, `>>>`).
- **Файлы**: [Arifmet.java](file:///c:/Users/user/Documents/code/java-education/Workspace/2JavaOperators/src/ru/qazsedc13/home/Arifmet.java), [Operators.java](file:///c:/Users/user/Documents/code/java-education/Workspace/2JavaOperators/src/ru/qazsedc13/home/Operators.java)

### 3. [HelloWorldApp](file:///c:/Users/user/Documents/code/java-education/Workspace/HelloWorldApp)
Базовое приложение для знакомства со структурой классов и выводом текста.
- **Файлы**: [HelloWorld.java](file:///c:/Users/user/Documents/code/java-education/Workspace/HelloWorldApp/src/HelloWorld.java), [MyClass.java](file:///c:/Users/user/Documents/code/java-education/Workspace/HelloWorldApp/src/ru/qazsedc13/home/MyClass.java)

## Как использовать

Проект создан с использованием IDE Eclipse. Для полноценной работы рекомендуется импортировать папку `Workspace` как рабочее пространство в Eclipse или импортировать отдельные папки как существующие Java проекты.

### Запуск из командной строки

Вы можете скомпилировать и запустить любой файл вручную. Например, для `JavaTypesClass`:

```bash
cd Workspace/1JavaTypes/src
javac JavaTypesClass.java
java JavaTypesClass
```

*Примечание: Большинство примеров кода в файлах закомментированы. Чтобы увидеть результат работы конкретного примера, раскомментируйте соответствующие строки перед компиляцией.*

## Технологии
- **Язык**: Java
- **IDE**: Eclipse (настроечные файлы включены в репозиторий)
