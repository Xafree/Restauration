package Generator;

import Builder.BuilderRestaurant;
import com.company.Restaurant;

import java.util.List;

public class GeneratorRestaurant
{
    private BuilderRestaurant builder;

    public Iterable<Restaurant> Generate(int _number)
    {

        for(var i = 0; i < _number; i++ )
        {
            this.builder.Build();
        }

        return this.builder;
    }


}
