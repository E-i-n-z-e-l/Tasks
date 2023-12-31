package Theory.A04_SpiskiIMapu.D002_LinkedList;

/**
 * Задача 4. Поиск цикла. Напишите метод, который определяет, содержит ли связанный список цикл
 * (то есть, если один из узлов в списке ссылается на уже существующий узел, образуя цикл).
 */
public class Task04 {
    public static void main(String[] args) {
        // Создаем связанный список с циклом
        Solution.Node head = new Solution.Node(1);
        head.next = new Solution.Node(2);
        head.next.next = new Solution.Node(3);
        head.next.next.next = new Solution.Node(4);
        head.next.next.next.next = head.next; // Здесь устанавливаем связь обратно на второй узел

        // Проверяем наличие цикла в списке
        boolean hasCycle = Solution.hasCycle(head);
        System.out.println("Связанный список содержит цикл: " + hasCycle); // Ожидаем получить true
    }
    public static class Solution {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static boolean hasCycle(Node head) {
            if (head == null || head.next == null) {
                return false;
            }

            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                if (slow == fast) {
                    return true;
                }
                slow = slow.next;
                fast = fast.next.next;
            }

            return false;
        }
    }
}
/*
"Циклический связанный список" - это структура данных, в которой узлы (элементы списка) соединены последовательно,
а последний узел связан с первым, образуя замкнутый цикл. Это делает его похожим на обычный связанный список, но
с дополнительной особенностью, что в конце списка нет "null", а вместо этого он ссылается на один из предыдущих
узлов (или на себя).

Задача заключается в том, чтобы написать метод, который будет проверять, содержит ли данный связанный список цикл.
Это важно, так как при работе со связанными списками может возникнуть ситуация, когда данные неожиданно указывают
назад на уже имеющийся узел, образуя цикл. Такие ситуации могут привести к некорректной работе алгоритмов,
работающих с такими списками.

Давайте рассмотрим подход к решению этой задачи.

Для проверки наличия цикла в связанном списке можно использовать алгоритм
"Быстрая замена и медленная замена" (Floyd's Tortoise and Hare algorithm).
Суть этого алгоритма заключается в использовании двух указателей:
один быстрый (за одну итерацию двигается на два элемента) и один медленный (двигается за один элемент).
Если список содержит цикл, то в какой-то момент эти два указателя встретятся внутри цикла.


 */
