public class App {

  // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de
  // type de
  // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit,
  // moyen, grand), du dessert et
  // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
  // les prix sont fixes pour chaque type de chose mais des réductions peuvent
  // s'appliquer
  // si cela rentre dans une formule!
  public int Compute(Dish dish) {
    // prix total à payer pour le client
    int total = 0;

    // si le client prends un plat en assiette
    if (dish.type.equals(DishType.PLAT)) {
      total += 15;

      // ainsi qu'une boisson de taille:
      if (dish.beverage.size().equals(BeverageSize.SMALL)) {

        total += 2;
        // dans ce cas, on applique la formule standard
        if (dish.desert.type().equals(DesertType.NORMAL)) {
          // pas de formule
          // on ajoute le prix du dessert normal
          total += 2;
        } else {
          // sinon on rajoute le prix du dessert special
          total += 4;
        }

        // si on prends moyen
      } else if (dish.beverage.size().equals(BeverageSize.MEDIUM)) {

        total += 3;
        // dans ce cas, on applique la formule standard
        if (dish.desert.type().equals(DesertType.NORMAL)) {
          // j'affiche la formule appliquée
          System.out.print("Prix Formule Standard appliquée ");
          // le prix de la formule est donc 18
          total = 18;
        } else {
          // sinon on rajoute le prix du dessert special
          total += 4;
        }

      } else if (dish.desert.type().equals(BeverageSize.LARGE)) {
        total += 4;
        // dans ce cas, on applique la formule standard
        if (dish.desert.type().equals(DesertType.NORMAL)) {
          // pas de formule
          // on ajoute le prix du dessert normal
          total += 2;
        } else {
          // dans ce cas on a la fomule max
          System.out.print("Prix Formule Max appliquée ");
          total = 21;
        }

      }
    }

    else if (dish.type.equals(DishType.SANDWICH)) {
      total += 10;
      // ainsi qu'une boisson de taille:
      if (dish.beverage.size().equals(BeverageSize.SMALL)) {
        total += 2;
        // dans ce cas, on applique la formule standard
        if (dish.beverage.size().equals(DesertType.NORMAL)) {
          // pas de formule
          // on ajoute le prix du dessert normal
          total += 2;
        } else if (dish.beverage.size().equals(DesertType.SPECIAL)) {
          // sinon on rajoute le prix du dessert special
          total += 4;
        }

        // si on prends moyen
      } else if (dish.beverage.size().equals(BeverageSize.MEDIUM)) {
        total += 3;
        // dans ce cas, on applique la formule standard
        if (dish.desert.type().equals(DesertType.NORMAL)) {
          // j'affiche la formule appliquée
          System.out.print("Prix Formule Standard appliquée ");
          // le prix de la formule est donc 13
          total = 13;
        } else {
          // sinon on rajoute le prix du dessert special
          total += 4;
        }

      } else if (dish.beverage.size().equals(BeverageSize.LARGE)) {
        total += 4;
        // dans ce cas, on applique la formule standard
        if (dish.desert.type().equals(DesertType.NORMAL)) {
          // pas de formule
          // on ajoute le prix du dessert normal
          total += 2;
        } else {
          // dans ce cas on a la fomule max
          System.out.print("Prix Formule Max appliquée ");
          total = 16;
        }

      }
    }
    if (dish.type.equals(DishType.PLAT) && dish.beverage.size().equals(BeverageSize.MEDIUM)
        && dish.desert.type().equals(DesertType.NORMAL) && dish.hasCoffee) {
      System.out.print(" avec café offert!");
    } else {
      // Assume coffee costs 1 unit, adding to the total only if coffee is not
      // included
      if (!dish.hasCoffee) {
        total += 1;
      }
    }
    return total;
  }

}