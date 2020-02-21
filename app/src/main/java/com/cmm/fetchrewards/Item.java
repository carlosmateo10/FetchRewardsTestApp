package com.cmm.fetchrewards;

import java.util.Comparator;

class Item{
    private String id;
    private String listID;
    private String name;

    String getId() { return id; }

    String getListID() { return listID; }

    String getName() { return name; }

    Item(String id, String listID, String name) {
        this.id = id;
        this.listID = listID;
        this.name = name;
    }

    static Comparator<Item> ItemListIDComparator = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            return o1.getListID().compareTo(o2.getListID());
        }
    };

    static Comparator<Item> ItemNameComparator = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            // Sort only if they have the same ListID
            if (o1.getListID().equals(o2.getListID())){
                return Integer.compare(Integer.parseInt(o1.getId()), Integer.parseInt(o2.getId()));
            } else return 0;
        }
    };


}
