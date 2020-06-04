package home.task3;

/**
 * Написать алгоритм, как в целом числе самый правый ноль превратить в единицу не используя
 * циклы и рекурсию.
 */
public class NumberChanger {

    public int changeTheMostRightDigitFromZeroToOne(int n) {
        return n | (n + 1);
    }
}
