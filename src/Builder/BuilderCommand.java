package Builder;

import com.company.Command;

public class BuilderCommand
{
    public Command Build(float Price)
    {
        return new Command(Price);
    }
}
