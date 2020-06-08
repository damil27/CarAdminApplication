


$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(location,status){
        $('#editId').val(location.id);
        $('#editAddress').val(location.address);
        $('#editCity').val(location.city);
         $('#Editddlstate').val(location.stateid);
         $('#editCountry').val(location.countryid);
         $('#EditDescription').val(location.description);
         $('#editDetails').val(location.details);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(location, status){


     $('#detailsId').val(location.id);
        $('#detailsAddress').val(location.address);
        $('#detailsCity').val(location.city);
         $('#detailsddlstate').val(location.stateid);
         $('#detailsCountry').val(location.countryid);
         $('#detailsDescription').val(location.description);
         $('#detailsDetails').val(location.details);
     } );
        $('#detailsModal').modal();
    });

    $('table #deleteButton').on('click', function(event){
       event.preventDefault();
       var href = $(this).attr('href');

       $('#confirmDeleteButton').attr('href', href);

       $('#deleteModal').modal();
    });

});