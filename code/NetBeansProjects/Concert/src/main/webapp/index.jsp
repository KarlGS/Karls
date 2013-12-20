<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<!--<html xmlns:fb="http://ogp.me/ns/fb#">-->
<head>
  <title>Concerts</title>
		<link rel="stylesheet" href="concert.css" type="text/css"/>
  <script src="/assets/application-f16495b4fc2107f44858c0bfb075e687.js" type="text/javascript"></script>
  <meta content="authenticity_token" name="csrf-param" />
<meta content="2mKbihdpo2NAdwPvcYaZFwhP2Jk2fqhBsKVIPZn2YO8=" name="csrf-token" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale = 1.0">

  <script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-29272318-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();


</script>
  <link href="css/concert.css" rel="stylesheet" media="screen">

</head>
<body class="logged-out artist-index">
  <div class="container">
    <div class="header">
      <a href="/" class="brand"><img src="http://fc01.deviantart.net/fs70/i/2012/024/e/5/wittle_baby_bender_by_megbeth-d3bdhh7.jpg" alt="soundready" /></a>

    </div>

    <div class="content">

<div class="top-search-holder">

</div>

<div class="content-inner">
  <h1 class="pump-up">Welcome Vistor!!! Please enter an artist name or venue<br> <strong>Boom, it's that easy.</strong></h1>
  <div class="full-search-bar">
    <ul class="item-stream unstyled search-input-stream">
      <li class="stream-item stream-header search-input-item">
        <form class="form-inline search-form" action="/artists/search">
          <input class="xlarge" class="artist-search" id="artist_search" name="q" type="text" placeholder="Ari's Barbershop Quartet, Phish, Miley Cyrus..." autocomplete="off" value="" />
          <button class="btn btn-large btn-inverse" id="artist_submit" type="submit"><i class="icon-search icon-white"></i></button>
        </form>
        <form accept-charset="UTF-8" action="/playlists" class="playlist-form" id="new_playlist" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="2mKbihdpo2NAdwPvcYaZFwhP2Jk2fqhBsKVIPZn2YO8=" /></div>
          <input type="hidden" class="artist-id" name="artist_id" value="" />
</form>      </li>
    </ul>
    <div class="search-status">
      <img src="/assets/circle_loader.gif" class="search-loader" />
    </div>
  </div>
</div>

<div class="artist-gallery">
  <div class="artist-shadow"></div>
  <div class="artist-images">
      <a href="http://soundready.fm/artists/107-Radiohead/playlists/5163">
        <div class="image-wrapper">
          <img src="http://upload.wikimedia.org/wikipedia/commons/b/b2/Grimes_at_SxSW_2012.jpg">
          <h3>Radiohead</h3>
        </div>
      </a>
      <a href="http://soundready.fm/artists/1896-Snoop+Dogg/playlists/9181">
        <div class="image-wrapper">
          <img src="https://pbs.twimg.com/profile_images/2630347813/cd4f6934fb1d2c8f05ef198ceba0f5d8.jpeg">
          <h3>Snoop Dogg</h3>
        </div>
      </a>
      <a href="http://soundready.fm/artists/2-The+Black+Keys/playlists/9849">
        <div class="image-wrapper">
          <img src="http://factmag-images.s3.amazonaws.com/wp-content/uploads/2013/08/Kool-Keith-The-Essential-8.6.2013.jpg">
          <h3>The Black Keys</h3>
        </div>
      </a>
      <a href="http://soundready.fm/artists/1081-Skinny+Puppy/playlists/670">
        <div class="image-wrapper">
          <img src="http://i.imgur.com/RW2WpH4.jpg">
          <h3>Skinny Puppy</h3>
        </div>
      </a>
  </div>
</div>


    </div>
    <div class="footer">

      <p>
        © SoundReady LLC. Made with <a target="_blank" href="http://getbootstrap.com">Bootstrap.</a>
      </p>
    </div>
    <div class="social-hooks">
  <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
	<script type="text/javascript" src="http://assets.pinterest.com/js/pinit.js"></script>
  <div id="fb-root"></div>
  <script>(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/all.js#xfbml=1&appId=100633410015224";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));</script>
</div>
  </div>
<!--    <meta property="og:title" content="SoundReady.fm" />
<meta property="og:type" content="activity" />
<meta property="og:url" content="http://soundready.fm" />
<meta property="og:image" content="http://soundready.fm/assets/small_logo.jpg" />
<meta property="og:description" content="Name a band, get a playlist for their next show. Boom, it's that easy." />
<meta property="og:site_name" content="SoundReady" />
<meta property="fb:admins" content="122417" />-->
  <script src="/assets/home_controller-18813aa1eaba90d03ea9d37517e25d45.js" type="text/javascript"></script>

</body>
</html>