public class BlogPost {
//  Create a `BlogPost` class that has
//  - an `authorName`
//  - a `title`
//  - a `text`
//  - a `publicationDate`
//  Create a few blog post objects:
//  - "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//            - Lorem ipsum dolor sit amet.
//  - "Wait but why" titled by Tim Urban posted at "2010.10.10."
//            - A popular long-form, stick-figure-illustrated blog about almost everything.
//  - "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//            - Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the
//              center of attention. When I asked to take his picture outside one of IBM’s
//              New York City offices, he told me that he wasn’t really into the whole
//              organizer profile thing.

    String authorname;
    String title;
    String publicationDate;
    String text;

    public BlogPost(String authorname, String title, String publicationDate) {
        this.authorname = authorname;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public void print(String text) {
        System.out.println("\"" + title + "\"" + " titled by " + authorname + " posted at " + "\"" + publicationDate + "\"" + "\n - " + text);
        this.text = text;
    }

    public static void main(String[] args) {
        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.");
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why","2010.10.10.");
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.");

        post1.print("Lorem ipsum dolor sit amet.");
        post2.print("A popular long-form, stick-figure-illustrated blog about almost everything.");
        post3.print("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n   When I asked to take his picture outside one of IBM’s New York City offices,\n   he told me that he wasn’t really into the whole organizer profile thing.");
    }
}
