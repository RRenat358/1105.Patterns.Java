/**
 * Сторитель
 *
 */



public class Builder {

    private String Header;
    private String Title;
    private String Content;
    private String Table;
    private int PageNumber;

    public void setHeader(String header) {
        Header = header;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setTable(String table) {
        Table = table;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public Builder(String header) { //Обязательное поле
        Header = header;
    }
}
