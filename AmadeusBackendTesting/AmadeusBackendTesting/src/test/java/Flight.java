/*Response: Object[string -> Array[Flight]]
 Flight {
       Id   integer
       From string
       To   string
       Date string
   }*/
public class Flight
{
    private int id ;
    private String from;
    private String to;
    private String date;

   /* public Flight(int id, String from, String to, String date) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
    }
*/
    public int getId()
    {

        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

}
