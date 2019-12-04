package com.example.electronicsrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private var listOfObject: ArrayList<Product> = ArrayList<Product>()
    var r1: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var s1 = ArrayList<String>()
    var s2 = ArrayList<Double>()
    var s3 = ArrayList<String>()
    var s4 = ArrayList<String>()
    var s5 = ArrayList<String>()
    var madr: MyAdapter? = null
    var images = ArrayList<String>()

    /*
    var imageges = intArrayOf(
        R.drawable.camera,
        R.drawable.headphone,
        R.drawable.laptop,
        R.drawable.tablet,
        R.drawable.tv
    )
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOfObject.add(
            Product(
                "HP ENVY Laptop.",
                240.00,
                "Black",
                "computer.PNG",
                "555 263 847",
                "HP ENVY Laptop\n" +
                        "Windows 10 Home 64\n, 10th Gen Intel® Core™ i7 processor. NVIDIA® GeForce® MX250 (4 GB )\n" +
                        "16 GB memory; 1 TB SSD storage"
            )
        )
        listOfObject.add(
            Product(
                "IP Phone GXP2140.",
                53.40,
                "Black",
                "ip_phone.PNG",
                "555 263 848",
                "The Grandstream GXP2140 phone is an attractive desktop device offering a wide range of features,\n" +
                        "Enjoy HD VoIP through the handset and speakerphone, or join five-way conferencing.\n" +
                        "The RJ9 port and Bluetooth support offer"
            )
        )
        listOfObject.add(
            Product(
                "HP Chromebook 14-inch Laptop with 180-Degree Hinge.",
                878.15,
                "Gray",
                "laptop.jpg",
                "555 263 849",
                "HP Chromebook 14-inch Laptop with 180-Degree Hinge, AMD Dual-Core A4-9120 Processor, 4\n" +
                        "GB SDRAM, 32 GB eMMC Storage, Chrome OS (14-db0030nr, Snow White)"
            )
        )
        listOfObject.add(
            Product(
                "the Apple iPad 2",
                600.00,
                "Blsck",
                "ipad.PNG",
                "555 263 850",
                "The world is in your hands with the Apple iPad 2, featuring Wi-Fi and a spacious 9.7-inch screen\n" +
                        " This second generation iPad provides users with 16 GB of integrated storage, " +
                        "\n 0.512 GB DDR2, and a 1 GHz Apple A5 processor.\n"

            )
        )
        listOfObject.add(
            Product(
                "Samsung UN55RU7100FXZA Flat 55-Inch",
                1230.09,
                "Black",
                "tv.jpg",
                "555 263 851",
                "Samsung UN55RU7100FXZA Flat 55-Inch 4K UHD 7 Series Ultra HD Smart TV with HDR and Alexa Compatibility (2019 Model)"
            )
        )

        r1 = findViewById<RecyclerView>(R.id.rv)
        for (element in listOfObject) {
            s1.add(element.title) //= resources.getStringArray(R.array.title);
            s2.add(element.price) //= resources.getStringArray(R.array.price);
            s3.add(element.color) //= resources.getStringArray(R.array.color);
            s4.add(element.desc) //= resources.getStringArray(R.array.detail)
            s5.add(element.itemid) //= resources.getStringArray(R.array.itemId)
            images.add(element.image)
        }
        madr = MyAdapter(this, s1, s2, images, s3, s4, s5)
        layoutManager = LinearLayoutManager(this)
        r1?.layoutManager = layoutManager
        r1?.adapter = madr

    }
}