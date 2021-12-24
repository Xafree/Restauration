package Builder;

import com.company.Restaurant;
import com.company.Server;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class BuilderRestaurant
{
    public Restaurant Build ()
    {
        return new Restaurant();
    }
}
