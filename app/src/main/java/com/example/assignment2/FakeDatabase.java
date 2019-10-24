package com.example.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/***
 * A class to simulate some data source existing. Use to practice intents and lists/RecyclerView
 * before going into APIs.
 *
 * Example usage:
 *      Article articleObject1 = FakeDatabase.getArticleById(1);
 *      System.out.println(articleObject1.getHeadline());
 *
 * Output:
 *      Diamonds, Warlords and Mercenaries: Russia’s New Playbook in Africa
 */
public class FakeDatabase {


    public static Item getItemById(int itemID) {
        return items.get(itemID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Item> getAllItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Item> items = new HashMap<>();

    static {
        items.put(1, new Item(
                1,
                "Cheese Burger",
                "$5.00",
                "A delicious Cheese Burger",
                 R.drawable.ic_burger
        ));
        items.put(2, new Item(
                2,
                "Veggie"+" Burger",
                "$4.00",
                "A delicious Veggie Burger",
                 R.drawable.ic_burger
        ));

        items.put(3, new Item(
                3,
                "Chicken Burger",
                "$5.00",
                "A delicious Chicken Burger",
                R.drawable.ic_burger
        ));

        items.put(4, new Item(
                4,
                "Veggie Noodles",
                "$8.00",
                "Delicious Veggie Noodle Pack",
                R.drawable.ic_noodle
        ));

        items.put(5, new Item(
                5,
                "Chicken Noodles",
                "$10.00",
                "Delicious Chicken Noodle Pack",
                R.drawable.ic_noodle
        ));

        items.put(6, new Item(
                6,
                "Cheese Noodles",
                "$8.00",
                "Delicious Cheese Noodles",
                R.drawable.ic_noodle
        ));

        items.put(7, new Item(
                7,
                "Veggie Pizza",
                "$12.00",
                "Delicious Veggie Pizza Family Pack",
                R.drawable.ic_pizza
        ));

        items.put(8, new Item(
                8,
                "Cheese Pizza",
                "$12.50",
                "Delicious Cheese Pizza Family Pack made with care",
                R.drawable.ic_pizza
        ));

        items.put(9, new Item(
                9,
                "Garlic Pizza",
                "$12.50",
                "Delicious Garlic Pizza made with patience and care for the family",
                R.drawable.ic_pizza
        ));

        items.put(10, new Item(
                10,
                "Peri Peri Chicken Pizza",
                "$14.50",
                "A fun for all peri peri chicken flavoured pizza made with care",
                R.drawable.ic_pizza
        ));

        items.put(11, new Item(
                11,
                "Hot Chips",
                "$5.50",
                "Crispy, Golden hot chips to suit everyone's taste buds",
                R.drawable.ic_hotchips
        ));

        items.put(12, new Item(
                12,
                "Soft Drink",
                "$3.00",
                "Icy cold drink to crush everyone's thirst under the sun",
                R.drawable.ic_can
        ));

        items.put(13, new Item(
                13,
                "Mud Cake",
                "$6.50",
                "A delicious piece of Chocolate Mud Cake",
                R.drawable.ic_mudcake
        ));

        items.put(14, new Item(
                14,
                "Onion Rings",
                "$3.50",
                "Deliciously cooked Onion Rings to taste",
                R.drawable.ic_oring
        ));

        items.put(15, new Item(
                15,
                "Ice-cream",
                "$3.50",
                "Different ice-cream flavours for everyone's summer",
                R.drawable.ic_icecone
        ));
    }
}

