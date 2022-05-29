function downloadImage() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://zoom.us/rec/play/NeYgbOsJqydyrgntRXS1t20oF-U9vOEthpAvse3wHgUQCFHX_IdwGBN_Ag5cfN2fmqyuK-zwJlO5IpNB.kz2NA6zCR6D5AP4E?continueMode=true&_x_zm_rtaid=xzMyDdvHRJucDd-11m9Q0Q.1652435173506.082d17bd26d08beb8086752e030dc4a7&_x_zm_rhtaid=945', true);
    xhr.responseType = 'blob';
    xhr.onload = function() {
      var urlCreator = window.URL || window.webkitURL;
      var imageUrl = urlCreator.createObjectURL(this.response);
      var tag = document.createElement('a');
      tag.href = imageUrl;
      tag.target = '_blank';
      tag.download = 'sample.png';
      document.body.appendChild(tag);
      tag.click();
      document.body.removeChild(tag);
    };
    xhr.onerror = err => {
      alert('Failed to download picture');
    };
    xhr.send();
  }
  downloadImage();