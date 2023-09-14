//Assignment 2 given by sir
class Publication {
    private String title;
    public int qty;
    private double price;
    private int copies;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getCopies() {
        return this.copies;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void sellCopy(int qty) {
        System.out.println("Total publication sell: $" + (qty * price));
    }

}

class Book extends Publication {
    private String author;

    public void ordercopies(int pcopies) {
        System.out.println("Total book sell: $" + (pcopies * getPrice()));// change from Sir's code
    }
}

class Magazine extends Publication {
    private int ordQty;
    private String currIssue;

    public void RecvNewIssue(String pNewIssue) {
        setCopies(ordQty);
        currIssue = pNewIssue;
    }

    public void sellCopy(int qty) {
        System.out.println("Total Mag sell: $" + (qty * getPrice()));
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setPrice(15);
        b1.ordercopies(3);

        Publication b2 = new Book();
        b2.setPrice(10);
        b2.getPrice();// getprice required as no getprice mentioned in this sellCopy method
        b2.sellCopy(3);

        Publication publi = new Publication();
        // publi.setCopies(3);
        // publi.getCopies();
        // makes no sense at all.

        // publi.setPrice(20.00);
        // publi.getPrice();

        // publi.sellCopy(2);
        // b2 does the same job for codes 73-81

        Publication magazine = new Magazine();
        magazine.setPrice(20.3);
        magazine.sellCopy(6);
    }
}

/*
 * OUTPUT
 * Total book sell: $45.0
 * Total publication sell: $30.0
 * Total Mag sell: $121.80000000000001
 */