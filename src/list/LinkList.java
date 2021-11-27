package list;

public class LinkList {
    private Link link;

    public LinkList(){
        link = null;
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = link;
        link = newLink;
    }

    public Link find(int key){
        Link current = link;

        while (current.iData != key){
            if (current.next == null) {
                return null;
            }else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key){
        Link current = link;
        Link previous = link;

        while (current.iData != key){
            if (current.next == null){
                return null;
            }else {
                previous = current;
                current = current.next;
            }
        }

        if (current == link){
            link = link.next;
        }else {
            previous.next = current.next;
        }

        return current;
    }

    public void displayList(){
        System.out.println("List (first-->last): ");
        Link current = link;

        while (current != null){
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }
}
