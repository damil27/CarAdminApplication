//
//$('document').ready(function(){
//    $('table #editButton').on('click',function(event){
//  event.preventDefault();
//            var href =$(this).attr('href');
//
//        $.get(href, function(country, status){

//});//            $('#editId').val(country.id);
//           $('#editDescription').val(country.description);
//            $('#editNationality').val(country.nationality);
//
//        });
//
//        $('#editModal').modal();
//    });
//




$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(InvoiceStatus,status){
        $('#editId').val(InvoiceStatus.id);
        $('#editDescription').val(InvoiceStatus.description);
        $('#editDetails').val(InvoiceStatus.details);
     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(InvoiceStatus, status){

                $('#detailsId').val(InvoiceStatus.id);
                $('#detailsDescription').val(InvoiceStatus.description);
                $('#detailsDetails').val(InvoiceStatus.details);
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