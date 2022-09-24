# Android_Bottom_Navigation
Instagram's Bottom Navigation Clone 

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

### menu/menu_item.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/homeIcon"
        android:icon="@drawable/home"
        android:title="Home"/>

    <item
        android:id="@+id/searchIcon"
        android:title="Search"
        android:icon="@drawable/search" />

    <item
        android:id="@+id/addIcon"
        android:title="Add"
        android:icon="@drawable/add" />

    <item
        android:id="@+id/favIcon"
        android:title="Activity"
        android:icon="@drawable/fav" />

    <item
        android:id="@+id/profileIcon"
        android:title="Profile"
        android:icon="@drawable/person" />


</menu>
```

### activity_main.xml
```
 <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNavigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"

        app:menu="@menu/menu_item"
        />
```

#### MainActivity.java
```
BottomNavigationView bottomNavigationView;

bottomNavigationView = findViewById(R.id.bottomNavigation);

      bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.homeIcon:
                        Toast toast = Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0,0);
                        toast.show();
                        break;

                    case R.id.searchIcon:
                        Toast toast1 = Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER, 0,0);
                        toast1.show();
                        break;

                    case R.id.addIcon:
                        Toast toast2 = Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.CENTER, 0,0);
                        toast2.show();                        break;

                    case R.id.favIcon:
                        Toast toast3 = Toast.makeText(MainActivity.this, "Activity", Toast.LENGTH_SHORT);
                        toast3.setGravity(Gravity.CENTER, 0,0);
                        toast3.show();
                        break;

                    case R.id.profileIcon:
                        Toast toast4 = Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT);
                        toast4.setGravity(Gravity.CENTER, 0,0);
                        toast4.show();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
                return true;
            }
        });
```

# App Highlight
![Bottom Nav App1](https://user-images.githubusercontent.com/74413402/192095736-986443a7-b888-45ba-ab8c-9dde692815a3.png)
![Bottom Nav App2](https://user-images.githubusercontent.com/74413402/192095738-4e756df7-8c84-4de5-b36b-f385f9c3ded0.png)
![Bottom Nav App3](https://user-images.githubusercontent.com/74413402/192095739-cec24aed-1e8c-4f84-a585-b784a8f0a1f4.png)
![Bottom Nav App4](https://user-images.githubusercontent.com/74413402/192095740-abf4bc6a-1172-44c6-90d4-620efafecbac.png)
![Bottom Nav App5](https://user-images.githubusercontent.com/74413402/192095741-e4e50201-cf20-4942-8e03-22a02646d090.png)
![Bottom Nav Code](https://user-images.githubusercontent.com/74413402/192095743-b938675b-c660-4577-85b1-a02cc8b0dc6b.png)

