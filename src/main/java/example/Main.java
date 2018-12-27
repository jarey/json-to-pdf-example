package example;

import java.io.File;

import org.yogthos.JsonPDF;

public class Main {

    public static void main(String[] args) throws Exception {
        String jsonDoc1 = "[{\"right-margin\":50,\r\n" + 
        		"   \"subject\":\"Some subject\",\r\n" + 
        		"   \"creator\":\"Jane Doe\",\r\n" + 
        		"   \"doc-header\":[\"inspired by\", \"William Shakespeare\"],\r\n" + 
        		"   \"bottom-margin\":25,\r\n" + 
        		"   \"author\":\"John Doe\",\r\n" +  
        		"   \"left-margin\":10,\r\n" + 
        		"   \"title\":\"Test doc\",\r\n" + 
        		"   \"size\":\"a4\",\r\n" + 
        		"   \"footer\":\"page\",\r\n" + 
        		"   \"top-margin\":30},\r\n" + 
        		"\r\n" + 
        		"   [\"heading\", \"Lorem Ipsum\"],\r\n" + 
        		"\r\n" + 
        		"   [\"paragraph\", \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non iaculis lectus. Integer vel libero libero. Phasellus metus augue, consequat a viverra vel, fermentum convallis sem. Etiam venenatis laoreet quam, et adipiscing mi lobortis sit amet. Fusce eu velit vitae dolor vulputate imperdiet. Suspendisse dui risus, mollis ut tempor sed, dapibus a leo. Aenean nisi augue, placerat a cursus eu, convallis viverra urna. Nunc iaculis pharetra pretium. Suspendisse sit amet erat nisl, quis lacinia dolor. Integer mollis placerat metus in adipiscing. Fusce tincidunt sapien in quam vehicula tincidunt. Integer id ligula ante, interdum sodales enim. Suspendisse quis erat ut augue porta laoreet.\"],\r\n" + 
        		"\r\n" + 
        		"   [\"paragraph\", \"Sed pellentesque lacus vel sapien facilisis vehicula. Quisque non lectus lacus, at varius nibh. Integer porttitor porttitor gravida. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus accumsan ante tincidunt magna dictum vulputate. Maecenas suscipit commodo leo sed mattis. Morbi dictum molestie justo eu egestas. Praesent lacus est, euismod vitae consequat non, accumsan in justo. Nam rhoncus dapibus nunc vel dignissim.\"],\r\n" + 
        		"\r\n" + 
        		"   [\"paragraph\", \"Nulla id neque ac felis tempor pretium adipiscing ac tortor. Aenean ac metus sapien, at laoreet quam. Vivamus id dui eget neque mattis accumsan. Aliquam aliquam lacinia lorem ut dapibus. Fusce aliquam augue non libero viverra ut porta nisl mollis. Mauris in justo in nibh fermentum dapibus at ut erat. Maecenas vitae fermentum lectus. Nunc dolor nisl, commodo a pellentesque non, tincidunt id dolor. Nulla tellus neque, consectetur in scelerisque vitae, cursus vel urna. Phasellus ullamcorper ultrices nisi ac feugiat.\"],\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"   [\"table\",\r\n" + 
        		"   {\"header\":[{\"color\":[100, 100, 100]}, \"FOO\"], \"cellSpacing\":20},\r\n" + 
        		"   [\"foo\",\r\n" + 
        		"    [\"cell\",\r\n" + 
        		"     [\"phrase\",\r\n" + 
        		"      {\"style\":\"italic\",\r\n" + 
        		"       \"size\":18,\r\n" + 
        		"       \"family\":\"halvetica\",\r\n" + 
        		"       \"color\":[200, 55, 221]},\r\n" + 
        		"      \"Hello Clojure!\"]],\r\n" + 
        		"    \"baz\"],\r\n" + 
        		"   [\"foo1\", [\"cell\", {\"color\":[100, 10, 200]}, \"bar1\"], \"baz1\"],\r\n" + 
        		"   [\"foo2\", \"bar2\",\r\n" + 
        		"    [\"cell\",\r\n" + 
        		"     [\"table\",\r\n" + 
        		"      [\"Inner table Col1\", \"Inner table Col2\", \"Inner table Col3\"]]]]],\r\n" + 
        		"\r\n" + 
        		"   [\"paragraph\", \"Suspendisse consequat, mauris vel feugiat suscipit, turpis metus semper metus, et vulputate sem nisi a dolor. Duis egestas luctus elit eget dignissim. Vivamus elit elit, blandit id volutpat semper, luctus id eros. Duis scelerisque aliquam lorem, sed venenatis leo molestie ac. Vivamus diam arcu, sodales at molestie nec, pulvinar posuere est. Morbi a velit ante. Nulla odio leo, volutpat vitae eleifend nec, luctus ac risus. In hac habitasse platea dictumst. In posuere ultricies nulla, eu interdum erat rhoncus ac. Vivamus rutrum porta interdum. Nulla pulvinar dui quis velit varius tristique dignissim sem luctus. Aliquam ac velit enim. Sed sed nisi faucibus ipsum congue lacinia. Morbi id mi in lectus vehicula dictum vel sed metus. Sed commodo lorem non nisl vulputate elementum. Fusce nibh dui, auctor a rhoncus eu, rhoncus eu eros.\"],\r\n" + 
        		"\r\n" + 
        		"   [\"paragraph\", \"Nulla pretium ornare nisi at pulvinar. Praesent lorem diam, pulvinar nec scelerisque et, mattis vitae felis. Integer eu justo sem, non molestie nisl. Aenean interdum erat non nulla commodo pretium. Quisque egestas ullamcorper lacus id interdum. Ut scelerisque, odio ac mollis suscipit, libero turpis tempus nulla, placerat pretium tellus purus eu nunc. Donec nec nisi non sem vehicula posuere et eget sem. Aliquam pretium est eget lorem lacinia in commodo nisl laoreet. Curabitur porttitor dignissim eros, nec semper neque tempor non. Duis elit neque, sagittis vestibulum consequat ut, rhoncus sed dui.\"],\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"  [\"anchor\", {\"style\":{\"size\":15}, \"leading\":20}, \"some anchor\"],\r\n" + 
        		"\r\n" + 
        		"  [\"anchor\", [\"phrase\", {\"style\":\"bold\"}, \"some anchor phrase\"]],\r\n" + 
        		"\r\n" + 
        		"  [\"anchor\", \"plain anchor\"],\r\n" + 
        		"\r\n" + 
        		"  [\"chunk\", {\"style\":\"bold\"}, \"small chunk of text\"],\r\n" + 
        		"\r\n" + 
        		"  [\"phrase\", \"some text here\"],\r\n" + 
        		"\r\n" + 
        		"  [\"phrase\",\r\n" + 
        		"   {\"style\":\"italic\",\r\n" + 
        		"    \"size\":18,\r\n" + 
        		"    \"family\":\"halvetica\",\r\n" + 
        		"    \"color\":[0, 255, 221]},\r\n" + 
        		"   \"Hello Clojure!\"],\r\n" + 
        		"\r\n" + 
        		"   [\"chapter\", [\"paragraph\", \"Second Chapter\"]],\r\n" + 
        		"\r\n" + 
        		"   [\"paragraph\", {\"keep-together\":true, \"indent\":20},\r\n" + 
        		"   \"a fine paragraph\"],\r\n" + 
        		"\r\n" + 
        		"   [\"list\", {\"roman\":true}, [\"chunk\", {\"style\":\"bold\"}, \"a bold item\"],\r\n" + 
        		"   \"another item\", \"yet another item\"],\r\n" + 
        		"\r\n" + 
        		"   [\"chapter\", \"Charts\"],\r\n" + 
        		"\r\n" + 
        		"   [\"chart\",\r\n" + 
        		"   {\"type\":\"bar-chart\",\r\n" + 
        		"    \"title\":\"Bar Chart\",\r\n" + 
        		"    \"x-label\":\"Items\",\r\n" + 
        		"    \"y-label\":\"Quality\"},\r\n" + 
        		"   [2, \"Foo\"], [4, \"Bar\"], [10, \"Baz\"]],\r\n" + 
        		"\r\n" + 
        		"   [\"chart\",\r\n" + 
        		"   {\"type\":\"line-chart\",\r\n" + 
        		"    \"title\":\"Line Chart\",\r\n" + 
        		"    \"x-label\":\"checkpoints\",\r\n" + 
        		"    \"y-label\":\"units\"},\r\n" + 
        		"   [\"Foo\", [1, 10], [2, 13], [3, 120], [4, 455], [5, 300], [6, 600]],\r\n" + 
        		"   [\"Bar\", [1, 13], [2, 33], [3, 320], [4, 155], [5, 200], [6, 300]]],\r\n" + 
        		"\r\n" + 
        		"   [\"chart\", {\"type\":\"pie-chart\", \"title\":\"Big Pie\"}, [\"One\", 21],\r\n" + 
        		"   [\"Two\", 23], [\"Three\", 345]],\r\n" + 
        		"\r\n" + 
        		"   [\"chart\",\r\n" + 
        		"   {\"type\":\"line-chart\",\r\n" + 
        		"    \"time-series\":true,\r\n" + 
        		"    \"title\":\"Time Chart\",\r\n" + 
        		"    \"x-label\":\"time\",\r\n" + 
        		"    \"y-label\":\"progress\"},\r\n" + 
        		"   [\"Incidents\", [\"2011-01-03-11:20:11\", 200],\r\n" + 
        		"    [\"2011-01-03-11:25:11\", 400], [\"2011-01-03-11:35:11\", 350],\r\n" + 
        		"    [\"2011-01-03-12:20:11\", 600]]]]";
        ClassLoader classLoader = Main.class.getClassLoader();
        String imgLeftPath = new File(classLoader.getResource("logo-xunta.png").getFile()).getAbsolutePath();
        String imgRightPath = new File(classLoader.getResource("logo-galicia.png").getFile()).getAbsolutePath();
        FooterHeaderPageHandler handler = new FooterHeaderPageHandler(imgLeftPath,imgRightPath);
        JsonPDF.writeToFile(jsonDoc1, "./out.pdf", handler);
    }
}
