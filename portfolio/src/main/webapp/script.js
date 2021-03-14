async function showGreetings(button) {
  const responseFromServer = await fetch('/greetings');
  const greetings = await responseFromServer.json();
  const greetingContainer = document.getElementById('greeting-container');
  
  greetingContainer.innerText = greetings.greeting;
}

function createMap(){
  const map = new google.maps.Map(
    document.getElementById('map'),
    {center: {lat: 34.052235, lng: -118.243683}, zoom: 8});
}
