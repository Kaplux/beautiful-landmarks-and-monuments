package fr.mildlyusefulsoftware.beautifullandmarksandmonuments.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends
		fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a150af47cadc73d";
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}

	private void putNewPictures() {
		String[] url = new String[] {
				"http://www.a-gc.com/images/2012/10/landmark-HD-Wallpapers.jpg",
				"http://mizwrite.files.wordpress.com/2009/06/beautiful-monterey.jpg",
				"http://stlouis-mo.gov/government/departments/planning/cultural-resources/images/oldpostoffice002.jpg",
				"http://www.highresolution-wallpapers.com/walls/architecture_and_landmark_around_the_world_4a-normal5.4.jpg",
				"http://cache.graphicslib.viator.com/graphicslib/media/58/dubai-s-famous-landmark-photo_1178712-770tall.jpg",
				"http://www.ship2shore.tv/wp-content/uploads/2012/09/Moscows-most-famous-landmark.jpg",
				"http://wallpapersdl.net/wp-content/uploads/2012/10/Liberty-Stone-Landmark-.jpg",
				"http://darkroom.baltimoresun.com/wp-content/uploads/2012/10/AFP_Getty-514720453.jpg",
				"http://www.globeimages.net/data/media/178/landmark_of_paris__the_arc_de_triomphe.jpg",
				"http://images.cdn.fotopedia.com/flickr-4638023261-hd.jpg",
				"http://picture4u.net/wp-content/uploads/2011/12/malaysia-tranquil-lagoon-bora-bora-island-french-polynesia.jpg",
				"http://picture4u.net/wp-content/uploads/2011/12/a-famous-landmark-in-malaysia-used-for-worship-malaysia-malaysia.jpg",
				"http://picture4u.net/wp-content/uploads/2011/12/penang-global-city-centre-malaysia.jpg",
				//"http://picture4u.net/wp-content/uploads/2011/12/kuala-lumpur-malaysia-2011.jpg",
				"http://www.citypictures.org/data/media/254/A_Landmark_Leander's_Tower_in_Istanbul_Turkey.jpg",
				"http://www.citypictures.org/data/media/254/A_mosque_in_Istanbul.jpg",
				"http://www.citypictures.org/data/media/254/a_mosque_in_kairouan_the_oldest_islamic_town_in_north_of_africa.jpg",
				"http://www.citypictures.org/data/media/254/A_religious_place_called_Ajmer_Sharif._Shrine_of_Hazrat_Khwaja_Moinudin_Chishti_RA_2.jpg",
				"http://www.citypictures.org/data/media/254/A_view_of_a_mosque_in_the_city_of_Jeddah_at_the_the_sun_set_in_Saudi_Arabia.jpg",
				"http://www.twincitiesdailyphoto.com/2008/night_landmark_center.jpg",
				"http://pool.twincitiesdailyphoto.com/2007/landmark_center-02.jpg",
				"http://c1038.r38.cf3.rackcdn.com/group1/building7154/media/04pl4pv.jpg",
				"http://images.travelpod.com/tripwow/photos/ta-00c7-f634-3336/the-most-famous-landmark-in-the-philippines-jacksonville-united-states+1152_12943654699-tpfil02aw-1237.jpg",
				"http://us.123rf.com/400wm/400/400/claudiodivizia/claudiodivizia1008/claudiodivizia100800354/7558264-brandenburger-tor-porte-de-brandebourg--celebre-landmark-a-berlin-allemagne--hdr-de-gamme-dynamique-.jpg",
				//"http://upload.wikimedia.org/wikipedia/commons/c/c4/Landmark_at_a_traffic_circle_in_Herat.jpg",
				"http://us.123rf.com/400wm/400/400/baloncici/baloncici0812/baloncici081200173/4045881-celebre-london-landmark-tower-bridge-a-la-riviere-thames.jpg",
				"http://www.themarkeworld.com/wp-content/uploads/2012/08/Landmark-sculpture.jpg",
				"http://images.travelpod.com/tripwow/photos/ta-00c0-399e-fc9b/a-roman-catholic-basilica-and-popular-landmark-in-paris-france+1152_12922797279-tpfil02aw-12917.jpg",
				"http://4.bp.blogspot.com/-_dPVB0wJVrA/Tk_bGWfsCRI/AAAAAAAABCE/NlWROvfvoFw/s1600/this-is-the-most-famous-landmark-in-laos-paksan-laos%252B1152_12944214867-tpfil02aw-7455.jpg",
				"http://www.myfourthirds.com/files/1107/Brunei_Landmark.jpg",
				"http://globeattractions.com/wp-content/uploads/2012/09/australia-sydney-a-city-landmark-building-opera-house-nature-city.jpg",
				"http://globeattractions.com/wp-content/uploads/2012/05/maine-portland-lighthouse-landscapes.jpg",
				"http://images.travelpod.com/tripwow/photos/ta-00be-d4b4-11cf/the-tower-bridge-is-a-historic-landmark-in-london-london-united-kingdom+1152_12919270526-tpfil02aw-7539.jpg",
				"http://i.images.cdn.fotopedia.com/flickr-4229517552-hd/Iceland/Culture_of_Iceland/Religion/Christianisation_of_Iceland/Hallgrimskirkja_-_an_architectural_landmark_in_Reykjavik_Iceland.jpg",
				"http://www.artbible.net/5NEWCOL/000_BANQUE_PRIMITIVE/7_LOISIRS/720_architecture/720%20PARIS%20NOTREDAME%20MONUMENT%20TOURISME.jpg",
				//"http://images.doctissimo.fr/1/voyages/scotland/photo/hd/0014124001/50543555b8/scotland-wallace-monument-big.jpg",
				"http://www.fond-ecran-image.com/galerie-membre/belgique-bruxelles/laeken-monument-leopold-1er-08-4-cpf-137.jpg",
				"http://www.gb-provence.com/documents/monument_aux_morts1.jpg",
				"http://images2.wikia.nocookie.net/__cb20071101041006/genealogy/images/c/c1/Washington_Monument_Dusk_Jan_2006.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/8/8d/Lom%C3%A9-Monument_de_l'Ind%C3%A9pendance.jpg",
				"http://www.maxi-fond-ecran.com/fond-ecran/ville-et-construction/monument_003.jpg",
				"http://tourwestamerica.com/Uploads/MonumentValley3.jpg",
				"http://www.electricscotland.com/history/images/Wallace_Monument.jpg",
				"http://www.photo-evasion.com/images/photo_monument_saint_nicolas_bastia_46.jpg",
				"http://lovingthebigisland.files.wordpress.com/2009/10/cook-monument-019.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/0/05/Monument_gergovie_fr.jpg",
				"http://images.doctissimo.fr/1/voyages/baltimore-md/photo/hd/7891038789/609285b3d/baltimore-md-monument-polonais-mondiale-big.jpg",
				"http://www.artbible.net/5NEWCOL/000_BANQUE_PRIMITIVE/7_LOISIRS/720_architecture/720%20MONUMENT%20ARCDETRIOMPHE%20PARIS.jpg",
				"http://www.hussein-dey.org/MEMOIRE/monument%20sidi%20ferruch/monument.jpg",
				"http://urbanqueer.files.wordpress.com/2010/01/monument-circle1.jpg",
				"http://www.lago-colony.com/WORLD_WAR_II/THOSE_WHO_DIED/Monument%20WWII%20in%20Curacao%202.jpg",
				//"http://upload.wikimedia.org/wikipedia/commons/7/7c/Battle_of_Ismailia_Monument.jpg",
				"http://hapax.qc.ca/photos-afrique-australe-2007/moyennes/monument-huguenot2.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/c/c9/Battle_Of_The_Nations-Monument.jpg",
				"http://images.fanpop.com/images/image_uploads/Hyde-Park-Monument-london-436395_1920_1440.jpg",
				"http://www.wallfizz.com/ville/monument/2709-monument-russe-WallFizz.jpg",
				"http://www.rickmann-uk.com/wp-content/uploads/Monument.jpg",
				"http://www.cn2i.fr/img/media/MONUMENT%20HISTORIQUE.JPG",
				"http://bpiw.net/_uploads/9c940fd8-0faa-4e46-a34f-5e78f9eadcd4_MEXICO_9_MONUMENT.jpg",
				"http://www.jblog.fr/wallpapers/jeux/portugal/Monument-to-the-Discoveries-Lisbon-Portugal.jpg",
				"http://www.jblog.fr/wallpapers/jeux/italie/Victor-Emmanuel-II-Monument-Rome-Italy.jpg",
				"http://www.bibleetnombres.online.fr/images42/tear_drop_monument.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/c/ca/Monument_to_the_Forefathers_1.jpg",
				"http://www.wallfizz.com/ville/monument/2713-monument-ancien-WallFizz.jpg",
				"http://www.wallfizz.com/ville/monument/1401-monument-WallFizz.jpg",
				"http://www.maxi-fond-ecran.com/fond-ecran/ville-et-construction/monument_005.jpg",
				"http://pictures-photos.ukraine-photo.com/desktop-wallpapers-photos-en/pictures-1280-800/image-wallpaper-1280-800-Ukraine-Magdeburg-Law-monument-Ukrainian-Ni732209.jpg",
				"http://i.images.cdn.fotopedia.com/flickr-3984106988-original/Rome/Vittoriano_Monument_to_Vittorio_Emanuele_II.jpg",
				"http://www.cathedrale-aixenprovence-monument.fr/wp-content/uploads/2011/09/Fa%C3%A7ade-St-Sauveur.-Haut..jpg",
				"http://notredamedebonsecours.fr/wp-content/uploads/Monument-Jeanne-dArc-3.jpg",
				"http://www.wallfizz.com/ville/monument/2656-monument-la-nuit-WallFizz.jpg",
				"http://bestswallpapersfotos.free.fr/photos-afrique/photos-monuments-afrique/monument.afrique%20(4).JPG",
				"http://www.jblog.fr/wallpapers/jeux/monuments-celebres/Cherry-Blossoms-Washington-Monument-Washington-D-C-.jpg",
				"http://us.123rf.com/400wm/400/400/mark52/mark520902/mark52090200027/4327259-bouddha-monument-a-hong-kong-chine.jpg",
				"http://2.bp.blogspot.com/-_GsFn6axNxc/TxQEQmDuQpI/AAAAAAAAAuE/foCPGO1vvnI/s1600/Monuments+of+India%252C+Indian+Monuments%252C+Major+Indian+Monuments%252C+Ancient+Monuments+in+India%252C+Historical+monuments+in+India%252C+Indian+historical+monument%252C+Heritage+monuments+of+India.jpg",
				"http://www.heitza.com/wp-content/uploads/2012/05/ScottMonumentEdimbourg01.jpg",
				"http://www.lapageapageau.com/wp-content/uploads/2011/11/monument-democratie.jpg",
				"http://www.tourisme-en-afrique.net/Burkina-faso/monument-martyrs-ouaga.jpg",
				"http://www.thaigirlfriendadvisor.com/wp-content/uploads/2011/12/Democracy_monument_Bangkok_Thailand.jpg"
		};
	
		int i = 40;
		List<Picture> pictures = new ArrayList<Picture>();
		for (int j = 0; j < url.length; j++) {
			try {
				Log.i("beautifullandmarksandmonuments", url[j]);
				Picture p = new Picture(j + i, url[j],
						Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}

}
