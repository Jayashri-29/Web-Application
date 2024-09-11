package mess.repository;

import mess.model.MainuCardModel;
import java.util.*;
public interface MainuCardRepo
{
 public boolean addItemToCard(MainuCardModel m);
 public List<MainuCardModel> getAllList();
 public boolean updatebyDay(MainuCardModel m);
 public boolean delByDay(String Day);
}
