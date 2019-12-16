package gabriel.googlemaps2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng hernandoSiles = new LatLng(-16.499456, -68.123275);
        mMap.addMarker(new MarkerOptions().position(hernandoSiles).title("Estadio Hernando Siles"));

        LatLng bombonera = new LatLng(-34.635634, -58.364896);
        mMap.addMarker(new MarkerOptions().position(bombonera).title("La Bombonera"));

        LatLng maracana = new LatLng(-22.911664, -43.230810);
        mMap.addMarker(new MarkerOptions().position(maracana).title("Estadio Maracaná"));

        LatLng campNou = new LatLng(41.380960, 2.122562);
        mMap.addMarker(new MarkerOptions().position(campNou).title("Estadio Camp Nou"));

        LatLng parcPrinces = new LatLng(48.841323, 2.252770);
        mMap.addMarker(new MarkerOptions().position(parcPrinces).title("Estadio Parc de Princes"));

        LatLng sanSiro = new LatLng(45.477935, 9.123992);
        mMap.addMarker(new MarkerOptions().position(sanSiro).title("Estadio San Siro"));

        LatLng wembley = new LatLng(51.555763, -0.279635);
        mMap.addMarker(new MarkerOptions().position(wembley).title("Estadio de Wembley"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wembley));



    }
}
