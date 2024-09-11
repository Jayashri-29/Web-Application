package mess.service;

import mess.model.MainuCardModel;
import java.util.*;
public interface MainuCardService 
{
 public boolean addItemToCard(MainuCardModel m);
 public List<MainuCardModel> getAllData();
 public boolean updatebyDay(MainuCardModel m);
 public boolean delByDay(String Day);
}
