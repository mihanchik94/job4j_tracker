package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**Collectors.averagingDouble() подсчитывает среднее значения элементов в группе.
 *В качестве аргумента принимается функция, в которой мы должны указать как преобразовать элемент в double.
 *Необходимо найти для каждой компании средний возраст сотрудников.
 */

public class AveragingMethod {
    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(worker -> worker.getCompany().getName(),
                        Collectors.averagingDouble(Worker::getAge)));
    }
}
