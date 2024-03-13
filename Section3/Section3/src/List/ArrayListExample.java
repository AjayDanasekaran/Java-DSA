package List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements using add() and addAll()
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        // Displaying the original list
        System.out.println("Original ArrayList: " + arrayList);

        // Removing an element using remove()
        arrayList.remove("Python");
        System.out.println("ArrayList after removing 'Python': " + arrayList);

        // Creating another collection to demonstrate removeAll()
        List<String> languagesToRemove = List.of("C++");
        arrayList.removeAll(languagesToRemove);
        System.out.println("ArrayList after removing all 'C++': " + arrayList);

        // Adding elements back using addAll()
        Collection<String> newLanguages = List.of("JavaScript", "Ruby");
        arrayList.addAll(newLanguages);
        System.out.println("ArrayList after adding new languages: " + arrayList);

        // Using ensureCapacity() and trimToSize()
        ((ArrayList<String>) arrayList).ensureCapacity(10);
        ((ArrayList<String>) arrayList).trimToSize();

        // Using indexOf() and lastIndexOf()
        int index = arrayList.indexOf("Java");
        System.out.println("Index of 'Java': " + index);

        // Using subList()
        List<String> subList = arrayList.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);

        // Using toArray()
        String[] array = arrayList.toArray(new String[0]);
        System.out.print("ArrayList converted to array: ");
        for (String language : array) {
            System.out.print(language + " ");
        }
        System.out.println();

        // Using clone()
        ArrayList<String> clonedList = (ArrayList<String>) arrayList.clone();
        System.out.println("Cloned ArrayList: " + clonedList);

        // Using removeRange()
        // Instead of removeRange, use subList and clear
        arrayList.subList(0, 2).clear();
        System.out.println("ArrayList after removing elements in the range [0, 2): " + arrayList);
    }
}

